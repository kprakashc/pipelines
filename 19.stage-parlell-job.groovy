pipeline {
    agent any
    stages {
        stage ('parallelStage') {
            parallel {
                stage ('sonar') {
                    steps {
                        echo "sonar stage Executing"
                        sleep(10)
                    }
                }
                stage ('fortyfy') {
                    steps {
                        echo "fortyfy stage Executing"
                        sleep(10)
                    }
                }
                stage ('new scan'){
                    steps {
                        echo "newscan stage Executing"
                        sleep(10)
                    }
                }
            }    
        }
    }
}