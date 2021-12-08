Feature: CAP_F_008 - Cambiar Idioma de la Web
  As un usuario comun
  I quiero cambiar el idioma de la web
  So seleccionar el idioma que deseo

  Background:
    Given CAPF008 - Cargando el Navegador

  @CAP_F_008
  Scenario: Cargando la web a Traducir
    When CAPF008 - Se haya cargado la web
    And CAPF008 - Aceptar las cookies

