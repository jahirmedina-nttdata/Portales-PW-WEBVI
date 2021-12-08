Feature: CAP_F_087 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF087 - Cargando el Navegador

  @CAP_F_087
  Scenario Outline: Cargando la web
    When CAPF087 - Se haya cargado la web
    And CAPF087 - Aceptar las cookies
    And CAPF087 - Limpiar
    And CAPF087 - Buscar por palabras "<palabras>"
    And CAPF087 - Seleccionar Provincias "<provincias>"
    And CAPF087 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF087 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF087 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF087 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | Andalucía, tierra de acogida de quebrantahuesos | none | none | none | none |
