Feature: CAP_F_060 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF060 - Cargando el Navegador

  @CAP_F_060
  Scenario Outline: Cargando la web
    When CAPF060 - Se haya cargado la web
    And CAPF060 - Aceptar las cookies
    And CAPF060 - Limpiar
    And CAPF060 - Buscar por palabras "<palabras>"
    And CAPF060 - Seleccionar Provincias "<provincias>"
    And CAPF060 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF060 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF060 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF060 - Buscar
    Examples:
      | palabras | provincias | tipo_espacio_natural | nombre_espacio_natural | equipamento |
      | congreso | none | none | none | none |
