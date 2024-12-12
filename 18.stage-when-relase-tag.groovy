pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'

    }
    stages {
        stage ('Deploy to dev') {
            steps {
              echo " Deploy to Developement"
        }  
            }
            
        
        stage ('Deploy to test') {
            steps {
                echo " Deploy to test "

            }

        }
        stage ('Deploy to stage') {
            when {
                branch 'release/*'
            }
            steps {
                echo "Deploying to stage"
            }
        }
        stage ('Deploy to prod') {
            when {
                tag pattern: "v\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}\\",comparator:  "REGEXP"
            }
            steps {
                echo "Deploying to prod"
            }
        }
    }
}