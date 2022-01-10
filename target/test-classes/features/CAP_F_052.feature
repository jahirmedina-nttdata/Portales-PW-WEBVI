Feature: CAP_F_052 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF052 - Cargando el Navegador

  @CAP_F_052
  Scenario Outline: Cargando la web
    When CAPF052 - Se haya cargado la web
    And CAPF052 - Aceptar las cookies
    And CAPF052 - Limpiar
    And CAPF052 - Buscar por palabras "<palabras>"
    And CAPF052 - Seleccionar Provincias "<provincias>"
    And CAPF052 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF052 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF052 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF052 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | none | none | none | none | ÁREA RECREATIVA |
