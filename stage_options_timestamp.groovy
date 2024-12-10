pipeline {
    agent any
    stages {
        stage ('Build') {
           options {
            timestamps()
           }
           steps {
            echo "Hello Prakkaash World"
           }
        }
    }
}

pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage ('Build'){
            steps {
                echo "Hello Prakkaash World"
            }
        }
        stage ('Test') {
                steps {
                    echo "Test Build"
                }
            
        }
    }
}