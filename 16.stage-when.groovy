pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('DeployTo Dev') {
            steps {
                echo "Deploying to Dev Environment"
            }
        }
        stage('ProdDeploy') {
            when {
                //branch condition
                expression {BRANCH_NAME ==~ /(production|staging)/ }
            }
            steps {
                echo "Deploying to production"
            }
        }
    }
}