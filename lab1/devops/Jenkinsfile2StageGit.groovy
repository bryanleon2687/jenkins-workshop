
node{
    withEnv(["ENV_CLIENTID=12345677-123456-123456"]){
    stage("init"){ 
        echo "${ENV_CLIENTID}"

        printenv
    }

    }


    stage("checkout"){
        println "==== TODO ===="
printenv
    }
}
