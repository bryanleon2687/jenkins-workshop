
node{
    stage("init"){

    }
    stage("checkout"){
        withCredentials([string(credentialsId:"bleon-token",variable:'token1')]){
            echo "${token1}"

            tokentmp = token1.split('\\|')
            tok1 = tokentmp[0]
            tok2 = tokentmp[1]

            echo " ${tok1} ---- ${tok2}"


        }

    }
}
