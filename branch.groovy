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
        stage ('devdeploy') {
            steps {
                echo "devdeploy pipeline"
            }
        }

    }
}