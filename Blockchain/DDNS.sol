pragma solidity 0.4.24;

contract DDNS {
    
    address owner;
    uint private toWithdraw;
    
    struct Domain {
        address owner;
        uint ip;
        bool isOwned;
    }

    mapping(string => Domain) domains;
    
    constructor() public {
        owner = msg.sender;
        toWithdraw = 0;
    }
    
    function buyDomain(string domain) public payable { //the 'payable' modifier is needed in order to receive ETH. Read the docs for further info.
        require(domains[domain].isOwned == false && msg.value >= 1 ether && msg.sender.balance - msg.value>= 0);
        domains[domain] = Domain(msg.sender, 0 , true);
    }
    
    function setIP(string domain, uint ip) public {
        require(domains[domain].owner == msg.sender);
        domains[domain].ip = ip;
    }
    
    function getIP(string domain) public view returns (uint) {
        require(domains[domain].owner == msg.sender && domains[domain].isOwned);
        return domains[domain].ip;
    }
    
    function withdraw(uint value) public {
        require(msg.sender == owner && toWithdraw - value >= 0);
        owner.transfer(value*(10**18));
    }
    
    //maybe functionality? Your choice!
}