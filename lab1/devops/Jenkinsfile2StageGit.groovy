
node{
    withEnv(["ENV_CLIENTID=12345677-123456-123456"]){
    stage("init"){ 
        echo "${ENV_CLIENTID}"

        sh "printenv"
        }

    }

    stage("checkout"){
        println "==== TODO ===="
        
        git{
            branch : "master",
            credentialsId: "github"
            url: "https://github.com/bryanleon2687/aks-rbac-example.git"
        }

        sh "ls-lta"


    }
}

//git add .
