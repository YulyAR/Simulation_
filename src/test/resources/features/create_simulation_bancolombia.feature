
  #Language: en

  Feature: consultar opciones para credito de Libre inversion
    como usuario de bancolombia quiero conocer opciones de credito de libre inversion
    para solicitar un credito

  Scenario: Simular un credito de libre inversion en la pagina creditos de consumo de bancolombia
    Given que he presionado el boton simular en la pagina de creditos de consumo de bancolombia
    When presiono el boton continuar en la pagina del simulador
    And puedo responder la pregunta,sabes cuanto dinero necesitas, seleccionando la opcion si
    And puedo ingresar un monto entre 1.000.000 y 500.000.000
    And puedo ingresar un plazo entre 48 y 84 meses
    And puedo seleccionar una fecha de nacimiento
    And puedo seleccionar el boton simular
    Then puedo ver las opciones para credito de libre inversion