Feature: CAP_F_061 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF061 - Cargando el Navegador

  @CAP_F_061
  Scenario Outline: Cargando la web
    When CAPF061 - Se haya cargado la web
    And CAPF061 - Aceptar las cookies
    And CAPF061 - Limpiar
    And CAPF061 - Buscar por palabras "<palabras>"
    And CAPF061 - Seleccionar Provincias "<provincias>"
    And CAPF061 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF061 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF061 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF061 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | none | none | none | none |
