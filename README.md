[![Build Status](https://travis-ci.org/BambooArg/grails-bamboo-commons-entity.svg?branch=master)](https://travis-ci.org/BambooArg/grails-bamboo-commons-entity.svg)
[![Stories in Ready](https://badge.waffle.io/BambooArg/grails-bamboo-commons-entity.svg?label=ready&title=Ready)](http://waffle.io/BambooArg/grails-bamboo-commons-entity)
[![Throughput Graph](https://graphs.waffle.io/BambooArg/grails-bamboo-commons-entity/throughput.svg)](https://waffle.io/BambooArg/grails-bamboo-commons-entity/metrics)

grails-bamboo-commons-entity
============================

El plugin está destinado al manejo de todas las clases comunes entity que pueden servir para los proyectos de bamboo


#Instalación

Agregar el plugin al proyecto
```groovy
compile ":grails-bamboo-commons-entity:0.1.0"
```

#Build

Para compilar el proyecto e intalarlo localmente se debe ejecutar

 ```script
gradle install
```

Para publicar un release se debe ejecutar

```script
gradle publish

```

El repositorio default para la publicación es http://nexus-bambooarg.rhcloud.com/nexus/content/groups/public/


###**Atención**
Tener en cuenta que se tiene que tener configurado en .grails/setting.groovy
```script
BAMBOO_REPOSITORY_USERNAME
BAMBOO_REPOSITORY_PASSWORD

```

o las propiedades del proyecto
```script
bambooRepositoryUsername
bambooRepositoryPassword

```


#Test

El proyecto usa travis-ci como entorno de integración continua. https://travis-ci.org/BambooArg/grails-bamboo-commons-entity.
Se ejecutan tantos los test unitarios como integrales, corriendo la base de datos de test en memoria.







