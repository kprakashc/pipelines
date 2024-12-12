//https://www.jenkins.io/doc/book/pipeline/syntax/#when
pipeline {
    agent any
    environment {
        DEPLOY_TO = 'Production'
    }
    stages {
        stage ('prod deploy') {
            when {
                environment name : 'DEPLOY_TO', value: 'other'
            }
            steps {
                echo "Deploying to Production"
            }
        }
    }
}