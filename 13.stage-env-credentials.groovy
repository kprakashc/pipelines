pipeline {
    agent any
    stages {
        stage ('Buid') {
            environment {
                // This directive supports a special helper method credentials()
                GITHUB_CREDS = credentials('githubcred') //username and password
            }
            steps {
                echo "My Guthub credntaals are : ${GITHUB_CREDS}"
                echo "My username is: ${GITHUB_CREDS_USR} "// to call only username we use variable_USR remember it
                echo "My password is : ${GITHUB_CREDS_PSW}" // to call only password we use _PSW 
            }
        }
    }
}


//withCredentials([gitUsernamePassword(credentialsId: 'githubcred', gitToolName: 'Default'), usernamePassword(credentialsId: 'githubcred', passwordVariable: 'PASSWORD_NAME', usernameVariable: 'USER_NAME')]) {
    // some block
}