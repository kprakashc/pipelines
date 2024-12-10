pipeline {
    agent any
    stages {
        stage ('Build'){
            steps {
                echo "Build pipeline"
                sh "hostname -i"
            }
        }
        stage ('ScanFortify') {
            steps {
                echo "Scanning the code"
            }
        }
        stage ('dockerbuild') {
            steps {
                echo "Docker Pipeline"
            }
        }
        stage ('dockerdeploy') {
            steps {
                echo "dockerdeploy pipeline"
            }
        }
        stage ('testdeploy') {
            steps {
                echo "testdeploy pipeline"
            }
        }
        stage ('Deploy to stage') {
            steps {
                echo "deploy to stage"
            }
        }
        stage ('Prod deployment') {
            steps {
                echo "Prod deployment"
            }
        }

    }
}