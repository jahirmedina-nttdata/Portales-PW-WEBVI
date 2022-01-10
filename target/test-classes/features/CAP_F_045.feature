Feature: CAP_F_045 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF045 - Cargando el Navegador

  @CAP_F_045
  Scenario Outline: Cargando la web
    When CAPF045 - Se haya cargado la web
    And CAPF045 - Aceptar las cookies
    And CAPF045 - Limpiar
    And CAPF045 - Buscar por palabras "<palabras>"
    And CAPF045 - Seleccionar Provincias "<provincias>"
    And CAPF045 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF045 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF045 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF045 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | none | LUGAR DE IMPORTANCIA COMUNITARIA | MARIASMAS DEL ODIEL | none |
