Feature: CAP_F_084 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF084 - Cargando el Navegador

  @CAP_F_084
  Scenario Outline: Cargando la web
    When CAPF084 - Se haya cargado la web
    And CAPF084 - Aceptar las cookies
    And CAPF084 - Limpiar
    And CAPF084 - Buscar por palabras "<palabras>"
    And CAPF084 - Seleccionar Provincias "<provincias>"
    And CAPF084 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF084 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF084 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF084 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | none | LUGAR DE IMPORTANCIA COMUNITARIA | ACEBUCHAL DE ALPIZAR | none |
