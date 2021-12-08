Feature: CAP_F_005 - Visualizar el Contenido de Siguenos en Redes Sociales
  As un usuario comun
  I quiero acceder a las redes sociales
  So seleccionar una red social

  Background:
    Given CAPF005 - Cargando el Navegador

  @CAP_F_005
  Scenario: Cargando la Web de Referencia
    When CAPF005 - Se haya cargado la pagina
    And CAPF005 - Aceptar las cookies
    And CAPF005 - Clickar en Twitter
    And CAPF005 - Clickar en Facebook
    And CAPF005 - Clickar en Instagram