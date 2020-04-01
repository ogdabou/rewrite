dependencies {
    api(project(":rewrite-xml"))
    implementation(project(":rewrite-core"))

    implementation("commons-cli:commons-cli:1.4")

    implementation("io.micrometer.prometheus:prometheus-rsocket-client:latest.release")
    implementation("io.rsocket:rsocket-transport-netty:latest.release")

    implementation("org.yaml:snakeyaml:latest.release")
}
