# eclipselink-composite-persistence-unit-example

A minimal example of how to set up a composite persistence unit with eclipselink.
Mainly to remember how it is done when I need it in future projects.

How to build and run it:


1. Create two different Databases with tables for Persons and ContactDetails (auto-generating tables does not work for composite units)
1. Adapt the persistence.xml for Persons and ContactDetails
1. run mvn package for modules ContactDetails and Persons
1. run mvn test for Application
