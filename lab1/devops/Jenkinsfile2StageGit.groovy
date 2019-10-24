
node{
    withEnv(["ENV_CLIENTID=12345677-123456-123456"]){
    stage("init"){ 
        echo "${ENV_CLIENTID}"

        sh "printenv"
        }

    }

    stage("checkout"){
        println "==== TODO ===="
        sh "printenv"
    }
}
