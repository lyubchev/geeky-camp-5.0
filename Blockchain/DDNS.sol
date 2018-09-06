pragma solidity 0.4.24;

contract DDNS {
    
    address owner;
    
    struct Domain {
        address owner;
        uint ip;
        bool isOwned;
    }

    
    mapping(string => Domain) domains;
    
    constructor() public {
        owner = msg.sender; 
    }
    
    function buyDomain(string domain) public payable { //the 'payable' modifier is needed in order to receive ETH. Read the docs for further info.
        require(domains[domain].isOwned == false && msg.value == 1 ether && msg.sender.balance - 1 ether >= 0);
        domains[domain] = Domain(msg.sender, 0 , true);
        
    }
    
    function setIP(string domain, uint ip) public {
        //sorcery
    }
    
    function getIP(string domain) public returns (uint) {
        //mystery
    }
    
    function withdraw(uint value) public {
        require(msg.sender == owner);
    }
    
    //maybe functionality? Your choice!
}
