pipeline {
    agent any
    stages {
        stage ('FirstStagescm'){
            steps {
                echo "first pipeline"
                sh "hostname -i"
            }
        }
        stage ('Fortify') {
            steps {
                echo "Scanning the code"
            }
        }
    }
}