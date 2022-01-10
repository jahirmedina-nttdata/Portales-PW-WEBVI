Feature: CAP_F_056 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF056 - Cargando el Navegador

  @CAP_F_056
  Scenario Outline: Cargando la web
    When CAPF056 - Se haya cargado la web
    And CAPF056 - Aceptar las cookies
    And CAPF056 - Limpiar
    And CAPF056 - Buscar por palabras "<palabras>"
    And CAPF056 - Seleccionar Provincias "<provincias>"
    And CAPF056 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF056 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF056 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF056 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | CÁDIZ | none | none | ÁREA RECREATIVA |
