Feature: CAP_F_013 - Buscar Contenido en la Web de Portales (Buscador de Tramites)
  As un usuario comun
  I quiero buscar contenido en la web principal
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF013 - Cargando el Navegador

  @CAP_F_013
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF013 - Se haya cargado la web
    And CAPF013 - Aceptar las cookies
    And CAPF013 - Escribir "<txtBusqueda>" y Buscar
    And CAPF013 - Abrir Busqueda Avanzada
    And CAPF013 - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF013 - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF013 - Retomar Busqueda
#    And CAPF013 - Abrir Busqueda Avanzada
    And CAPF013 - Seleccionar Tema Ambiental : "<numero>"
    And CAPF013 - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |

