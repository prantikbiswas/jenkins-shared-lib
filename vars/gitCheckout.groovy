def call(Map stageParams) {

    println "Checking out..."

    checkout([
            $class: 'GitSCM',
            branches: [[name:  stageParams.branch ]],
            userRemoteConfigs: [[ url: stageParams.url ]]
    ])
}
