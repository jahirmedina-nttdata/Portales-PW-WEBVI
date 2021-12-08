Feature: CAP_F_014 - Buscar Contenido en la Web de Portales
  As un usuario comun
  I quiero buscar contenido en la web principal
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF014 - Cargando el Navegador

  @CAP_F_014
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF014 - Se haya cargado la web
    And CAPF014 - Aceptar las cookies
    And CAPF014 - Escribir "<txtBusqueda>" y Buscar
    And CAPF014 - Abrir Busqueda Avanzada
    And CAPF014 - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF014 - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF014 - Retomar Busqueda
#    And CAPF014 - Abrir Busqueda Avanzada
    And CAPF014 - Seleccionar Tema Ambiental : "<numero>"
    And CAPF014 - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |

