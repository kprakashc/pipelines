pipeline {
    agent any
    environment {
        // our own custom env variables
        DEPLOY_TO = 'production'
    }
    stages{
        stage ('Deploy to Dev') {
            steps {
                echo "Deployimg to Dev Enviornment"
            }
        }
        stage ('Proddeploy') {
            when {
                allOf {
                    branch 'production'
                    environment name: 'DEPLOY_TO', value: 'production'
                }
            }
            steps {
                echo "Deploying to production"
            }
        }
                 
    }

}