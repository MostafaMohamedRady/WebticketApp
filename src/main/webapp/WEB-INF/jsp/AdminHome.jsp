
<%@include file="Header.jsp" %>

<div class="wrapper "> 

    <%@include  file="AdminSideBar.jsp" %>

    <%-- page Contenct --%>

    <div id="content">
        <div class="panel-group" id="accordion">
            <div class="panel panel-primary" id="panel1">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-target="#collapseOne" 
                           href="#collapseOne">
                            Stores Information
                        </a>
                    </h4>
                </div>
                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body" id ="storeInfo">
                        <div class="table responsive" ><table  border="1"> 
                                <thead> <tr><th> Store-Name #</th><th>  Terminals # </th><th> SIM #</th> <th></th></tr></thead>
                                  <tbody> <tr><td></td>

                    <td></td>

                    <td></td></tr></tbody>
                                  
                                   </table></div>
                        </div>
                    </div>
                </div>


                <br><br><br><br>


                <div class="panel panel-primary" id="panel2">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-target="#collapseTwo" 
                               href="#collapseTwo">
                                Tickets Information
                            </a>
                        </h4>

                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse in">
                        <div class="panel-body" id="allTickets">


                        </div>
                    </div>


                </div>
            </div>



        </div>


    </div>     




    <script>


        $(document).ready(function () {

            $.ajax({
                url: 'TotalStoreInfo',
                success: function (responseText) {
                    $('#storeInfo').html(responseText);
                }
            });
        });


        $(document).ready(function () {

            $.ajax({
                url: 'AllTicekets',
                success: function (responseText) {
                    $('#allTickets').html(responseText);
                }
            });
        });
    </script>





</body>
</html>
