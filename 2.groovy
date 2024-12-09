pipeline {
    agent {
        label 'java' // this should be configured in the slave section
        }
    stages {
        stage ("Build") {
            steps {
                echo "Hello Prakkaash world!!"
            }
        }
        stage ('docker') {
            agent 'docker-slave'
            steps {
                echo " Docker running on slaves"
                sh "docker build -t siva:v1 ."
            }

        }
    }
}

pipeline {
    agent none
    stages {
        stage ("build" {
            agent {
                node {
                    label 'java-slave'
                    customWorkspace "/home/siva/customwork"
                }
            }
        })
    }
}