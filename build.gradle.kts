import org.asciidoctor.gradle.AsciidoctorTask

plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("melix")
}

tasks.named<AsciidoctorTask>("asciidoctor").configure {
    resources(delegateClosureOf<CopySpec>({
        from("src/resources")
    }))
}