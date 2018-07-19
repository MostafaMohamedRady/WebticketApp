
<body>
    <nav id="sidebar">
        <div class="sidebar-header">
            <button type="button" id="sidebarCollapse" class="btn btn-info navbar-btn  " >
                <i class="glyphicon glyphicon-align-right"></i>
                <span></span>
            </button>
        </div>
        <ul class="list-unstyled components">
            <li class="active">
                <a href="/WebTicketRevamp/AdminHome">
                    <i class="glyphicon glyphicon-home"></i>
                    Home
                </a></li>

            <li >
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-briefcase"></i>
                    Accounts
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li><a href="/WebTicketRevamp/TechnicalIndex"> Technical</a></li>
                    <li><a href="/WebTicketRevamp/MerchantIndex"> Merchant</a></li>
                    <li><a href="/WebTicketRevamp/StoreIndex"  > Store</a>
                    </li>
                    <li><a href="/WebTicketRevamp/ChangePassword">Change Password</a></li>
                </ul>
            </li>
            <li>
                <a href="#Terminal" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-phone"></i>
                    Terminal
                </a>
                <ul class="collapse list-unstyled" id="Terminal">
                    <li><a href="/WebTicketRevamp/TerminalIndex">Terminals</a></li>
                    <li><a href="/WebTicketRevamp/DeploymentIndex">Deployment</a></li>
                    <li><a href="/WebTicketRevamp/TerminalUpdate">Update Deployment </a></li>

                </ul>
            </li>
            <li>
                <a href="#SIM" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-duplicate"></i>
                    SIM
                </a>
                <ul class="collapse list-unstyled" id="SIM">
                    <li><a href="/WebTicketRevamp/SimIndex"> SIM </a></li>
                </ul>
            </li>
            <li>
                <a href="#RollPaper" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-duplicate"></i>
                    Roll Paper
                </a>
                <ul class="collapse list-unstyled" id="RollPaper">
                    <li><a href="/WebTicketRevamp/MerchantRP">Store to Merchant</a></li>
                </ul>
            </li>
            <li>
                <a href="#Tickets" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-duplicate"></i>
                    Tickets
                </a>
                <ul class="collapse list-unstyled" id="Tickets">
                    <li><a href="/WebTicketRevamp/InboxTickets">Inbox Tickets</a></li>
                    <li><a href="/WebTicketRevamp/AssignTicket">Assign Ticket</a></li>
                    <li><a href="/WebTicketRevamp/TicketsHistory">Tickets History</a></li>
                    <li><a href="/WebTicketRevamp/TicketsMaintenance">Tickets Maintenance</a></li>
                </ul>
            </li>
            <li>
                <a href="#Withdraw" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    Withdraw
                </a>
                <ul class="collapse list-unstyled" id="Withdraw">

                    <li><a href="/WebTicketRevamp/WithDraw">Add New Withdraw</a></li>
                    <li><a href="/WebTicketRevamp/WithDrawLogs">WithDraw Logs </a></li>
                </ul>
            </li>
            <li>
                <a href="#Reports" data-toggle="collapse" aria-expanded="false">
                    <i class="glyphicon glyphicon-envelope"></i>
                    Reports
                </a>
                <ul class="collapse list-unstyled" id="Reports">
                    <li><a href="/WebTicketRevamp/TechnicalReport">Technical Report</a></li>
                    <li><a href="/WebTicketRevamp/MerchantReport">Merchant  Report</a></li>
                    <li><a href="/WebTicketRevamp/MnReport">Maintenance Report</a></li>
                    <li><a href="/WebTicketRevamp/TicketReport">Tickets Report</a></li>
                    <li><a href="/WebTicketRevamp/WdReport">Withdraw  Report</a></li>
                    <li><a href="/WebTicketRevamp/WithdrawReport">Store Report</a></li>
                    <li><a href="/WebTicketRevamp/SimReport">SIM Report</a></li>
                    <li><a href="/WebTicketRevamp/TerminalReport">Terminal Report</a></li>
                    <li><a href="/WebTicketRevamp/RpReport">Roll Paper Report</a></li>
                </ul>
            </li>

            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-log-out"></i>
                    Log Out
                </a>
            </li>
        </ul>


    </nav>




    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>


</body>
</html>
