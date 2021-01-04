Feature: logear usuario
  Como usuario web , quiero navegar con mi usuario en la pagina Automationpractice para poder administrar mi perfil

  @ESC-02-LoguearUsuario
  Scenario: Logear usuario exitosamente
    Given  el usuario desea logear en la pagina Automationpractice
    When   envía informacion requerida
    Then   debe poder administrar su perfil