package contracts.actor

/**
 * Created by tjololo on 02/11/16.
 */
org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/movie/role'
        body(
                [
                        movie    : [
                                title : "Deadpool",
                                actors: [
                                        [
                                                name: "Ryan Reynolds",
                                                part: "Deadpool"
                                        ],
                                        [
                                                name: "Morena Baccarin",
                                                part: "Vanessa"
                                        ]
                                ]
                        ],
                        actorname: "Ryan Reynolds"
                ]
        )
        headers {
            header('Content-Type', 'application/vnd.actor.v1+json')
        }
    }
    response {
        status 200
        body ([
                acts: "true",
                part: "Deadpool"
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/vnd.actor.v1.json.*')),
                    consumer('application/vnd.actor.v1+json'))
            )
        }
    }
}