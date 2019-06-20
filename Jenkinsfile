node {
  def app

  stage("Clone repository") {
    /* clone the repository */
    checkout scm    
  }

  stage("Permissions") {
    steps {
      parallel {
        stage("as permissions") {
          dir("AdminServer"){
      sh "chmod 711 ./mvnw"
    }
        }
        stage("ds permissions") {
          dir("DiscoveryServer"){
      sh "chmod 711 ./mvnw"
    }
        }
      }
    }
    /* change directory */
    dir("AdminServer"){
      /* set maven wrapper permissions */
      sh "chmod 711 ./mvnw"
    }
  }

  stage("Test") {
    dir("AdminServer"){
      /* runt tests */
      sh "./mvnw test"
    }
  }

  stage("Build Project") {
    dir("AdminServer"){
      /* build the project */ 
      sh "./mvnw clean install"
    }
  }

  stage("Build Image") {
    dir("AdminServer"){
      app = docker.build("vaiden/admin-server")
    }
  }

  stage("Push Image") {
    dir("AdminServer"){
      docker.withRegistry("https://registry.hub.docker.com", "docker-hub-credentials") {
        app.push("${env.BUILD_NUMBER}")
        app.push("latest")
      }
    }
  }

}