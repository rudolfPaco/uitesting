Feature: Formulario

  Background: create, modify, delete machine
    Given 'Home' page is loaded

  Scenario: mostrar formulario de equipo
    And press new 'Formulario' button
    And insert "123" codigo name field in 'Formulario' page
    And insert "KI3342" categoria name field in 'Formulario' page
    And insert "Caterpillar" marca name field in 'Formulario' page
    And insert "32EDE" modelo name field in 'Formulario' page
    And insert "2330 kg" capacidad name field in 'Formulario' page
    And insert "234" precio name field in 'Formulario' page
    And insert "https://www.youtube.com/embed/0cBEyWb_SEA" urlVideo name field in 'Formulario' page
    And press submit button

    And press show 'Formulario' button
    And press modify machine button
    And press delete machine button


