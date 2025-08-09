def call(String Projectname , String ImageTag , string DockerHubUser){
  sh "docker build -t $"dockerHubUser"/$"Projectname":$"ImageTag" ."
}
