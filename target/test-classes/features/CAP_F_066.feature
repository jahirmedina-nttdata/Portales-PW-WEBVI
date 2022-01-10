Feature: CAP_F_066 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF066 - Cargando el Navegador

  @CAP_F_066
  Scenario Outline: Cargando la web
    When CAPF066 - Se haya cargado la web
    And CAPF066 - Aceptar las cookies
    And CAPF066 - Limpiar
    And CAPF066 - Buscar por palabras "<palabras>"
    And CAPF066 - Seleccionar Provincias "<provincias>"
    And CAPF066 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF066 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF066 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF066 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | CÁDIZ | none | none | ÁREA RECREATIVA |
