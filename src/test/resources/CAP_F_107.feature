Feature: CAP_F_107 - Validar estado de la Web
  As un usuario comun
  I quiero visualizar la web
  So cargar la web

  Background:
    Given CAPF107 - Cargando el Navegador

  @CAP_F_107
  Scenario Outline: Cargando la web
    When CAPF107 - Se haya cargado la web
    And CAPF107 - Aceptar las cookies
    And CAPF107 - Limpiar
    And CAPF107 - Buscar por palabras "<palabras>"
    And CAPF107 - Seleccionar Provincias "<provincias>"
    And CAPF107 - Seleccionar Categorias "<categoria>"
    And CAPF107 - Seleccionar SubCategorias "<subcategoria>"
    And CAPF107 - Seleccionar Tipo de Archivo "<tipo_archivo>"
    And CAPF107 - Selecciona un tipo de Equipamento "<equipamento>"
    And CAPF107 - Seleccionar Tipos de Espacios Naturales "<tipo_espacio_natural>"
    And CAPF107 - Nombre de Espacio Natural "<nombre_espacio_natural>"
    And CAPF107 - Buscar
    Examples:
      | palabras | provincias | categoria | subcategoria | tipo_archivo | equipamento | tipo_espacio_natural | nombre_espacio_natural |
      | none | none | none | none | none | none | none | none |
