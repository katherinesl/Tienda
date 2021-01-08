
Feature: Registrar usuario
  Como usuario web, quiero registrarme en Automationpractice para poder recibir promociones

  @ESC-01-RegistrarUsuario..
  Scenario: Registrar usuario exitosamente
    Given el usuario desea registrarse en Automationpractice
    When envia informacion requerida
    Then debe poder visualizar sus datos como usuario


