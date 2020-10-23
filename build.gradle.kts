group = "com.octokat.app"
version = "1.0-SNAPSHOT"
plugins {
    application
}
application {
    mainClass.set("com.octokat.app.InstallApp")
}
repositories {
    jcenter()
    maven {
        name = "remote"
        url = uri("https://maven.pkg.github.com/github-packages-examples/maven-publish")
        credentials {
            username = "token"
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
dependencies {
    compile("com.octokat.app:octokat-app:1.0-SNAPSHOT")
}
