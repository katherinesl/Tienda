Feature: Buscar vestido
  Como usuario web, quiero buscar todos los vestidos de noche en la pagina de Automatizacionpractice para poder visualizar el precio


  @ESC-03-BuscarVestido
  Scenario: Buscar vestido exitosamente
    Given el usuario desea buscar todos vestido en la pagina automationpractice
    When ingresa el producto vestido
    Then debe mostrar todos los vestidos con sus precios