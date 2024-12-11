pipeline {
    agent any 
    environment {
        siva = "Kalabhairav and time"
        name = "Narayana"
    }
    stages {
        stage ("Build") {
            environment {
                ram = "Hanuman"
                name = "Krishna"
            }
            steps {
            echo " This Is Prakkaash World ${name}"
            echo "you are blessed by ${siva}"
            echo "Welcome ${ram}"
            }
        }
        
    }
}