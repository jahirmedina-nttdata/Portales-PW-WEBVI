Feature: CAP_F_075 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF075 - Cargando el Navegador

  @CAP_F_075
  Scenario Outline: Cargando la web
    When CAPF075 - Se haya cargado la web
    And CAPF075 - Aceptar las cookies
    And CAPF075 - Limpiar
    And CAPF075 - Buscar por palabras "<palabras>"
    And CAPF075 - Seleccionar Provincias "<provincias>"
    And CAPF075 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF075 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF075 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF075 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | none | none | none | none |
