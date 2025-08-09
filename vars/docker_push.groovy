def call(String Project, String ImageTag, String dockerHubuser){

  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable: 'dockerHubuser', passwordVariable: 'dockerHubPass')]) {
    sh "docker login -u ${dockerHubuser} -p ${dockerHubPass}"
    }
  sh "docker push ${dockerHubuser}/${ImageTag}"
}
