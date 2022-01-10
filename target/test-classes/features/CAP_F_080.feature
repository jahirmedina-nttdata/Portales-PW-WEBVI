Feature: CAP_F_080 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF080 - Cargando el Navegador

  @CAP_F_080
  Scenario Outline: Cargando la web
    When CAPF080 - Se haya cargado la web
    And CAPF080 - Aceptar las cookies
    And CAPF080 - Limpiar
    And CAPF080 - Buscar por palabras "<palabras>"
    And CAPF080 - Seleccionar Provincias "<provincias>"
    And CAPF080 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF080 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF080 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF080 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | ALMERÍA | none | none | ÁREA RECREATIVA |
