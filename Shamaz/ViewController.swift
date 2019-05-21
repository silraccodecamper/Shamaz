//
//  ViewController.swift
//  Shamaz
//
//  Created by Shilpa Racham on 5/9/19.
//  Copyright © 2019 Shilpa Racham. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    // To display the prompts on the label
    @IBOutlet weak var displayTask: UILabel!
    //Prompts that explain future tasks
    @IBAction func futureTask(_ sender: Any) {
        let prompts = ["What do you want to do 1 year from now","Dream holiday to visit in next few months ","Where do you want to see yourself in next year","whats one thing you want to change in near future",
        "where do you want to celebrate your next birthday","what do you want to do if you get a break next week","what do you want to see in your job couple of months from now",]
        
        let random = prompts[Int(arc4random_uniform(UInt32(prompts.count)))]
        displayTask.text = random
        
    }
    //Prompts that explain past experiences
    @IBAction func pastTask(_ sender: Any) {
        let prompts = ["Describe your day 10 days ago", "Tell about your holiday last year", "Best memories from prevous trip ", "Talk about any thing in the past that inspired you", "Movie you watched 10 days ago","Whats the wackiest gift you received recently","Explain the embarassing moments you experienced couple of days ago"]
    
        let random = prompts[Int(arc4random_uniform(UInt32(prompts.count)))]
        displayTask.text = random
    }
    
    //Function that generates random number to pick whose turn it is
    @IBAction func nextTurn(_ sender: Any) {
        displayTask.text = String(Int.random(in: 1 ... 10))
    
    }
    
}

