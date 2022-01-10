Feature: CAP_F_018 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF018 - Cargando el Navegador

  @CAP_F_018
  Scenario: Cargando la web
    When CAPF018 - Se haya cargado la web
    And CAPF018 - Aceptar las cookies

