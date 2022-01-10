Feature: CAP_F_015 - Buscar Contenido en la Web de Portales
  As un usuario comun
  I quiero buscar contenido en la web principal
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF015 - Cargando el Navegador

  @CAP_F_015
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF015 - Se haya cargado la web
    And CAPF015 - Aceptar las cookies
    And CAPF015 - Escribir "<txtBusqueda>" y Buscar
    And CAPF015 - Abrir Busqueda Avanzada
    And CAPF015 - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF015 - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF015 - Retomar Busqueda
#    And CAPF015 - Abrir Busqueda Avanzada
    And CAPF015 - Seleccionar Tema Ambiental : "<numero>"
    And CAPF015 - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |