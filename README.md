# WSO2 Event Handler Maven Archetype <!-- omit in toc -->

Maven Archetype for WSO2 Event Handlers. Use the following maven archetype to generate maven projects to implement WSO2 related event handlers for WSO2 IS Services.

#### `v2.0.0`

Now supports generating boilerplates with or without `IdentityConnectorConfig`. Use `-DIdentityConnectorConfig` flag and provide `Y or N` to specify the generation of boilerplate with or without connector configurations.

```xml
<dependency>
    <groupId>com.athiththan.wso2</groupId>
    <artifactId>wso2-event-handlers</artifactId>
    <version>2.0.0</version>
</dependency>
```

## Usage

```shell
mvn archetype:generate  -DarchetypeGroupId=com.athiththan.wso2      \
                        -DarchetypeArtifactId=wso2-event-handlers   \
                        -DarchetypeVersion=2.0.0                    \
                        -DgroupId=<Group ID>                        \
                        -DartifactId=<Artifact ID>                  \
                        -DIdentityConnectorConfig=<Y || N>
```

Use the following command to skip the `interactive-mode` when generating maven projects

```shell
mvn archetype:generate  -DarchetypeGroupId=com.athiththan.wso2      \
                        -DarchetypeArtifactId=wso2-event-handlers   \
                        -DinteractiveMode=false                     \
                        -DarchetypeVersion=2.0.0                    \
                        -DgroupId=<Group ID>                        \
                        -DartifactId=<Artifact ID>                  \
                        -DIdentityConnectorConfig=<Y || N>
```
